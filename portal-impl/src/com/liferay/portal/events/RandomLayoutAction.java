/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.events;

import com.liferay.portal.kernel.events.Action;
import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.Randomizer;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.GroupConstants;
import com.liferay.portal.model.Layout;
import com.liferay.portal.model.LayoutTypePortlet;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.service.LayoutLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.WebKeys;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Brian Wing Shun Chan
 */
public class RandomLayoutAction extends Action {

	@Override
	public void run(HttpServletRequest request, HttpServletResponse response)
		throws ActionException {

		try {

			// Do not randomize layout unless the user is logged in

			ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(
				WebKeys.THEME_DISPLAY);

			if (!themeDisplay.isSignedIn()) {
				return;
			}

			// Do not randomize layout unless the user is accessing the portal

			String requestURI = GetterUtil.getString(request.getRequestURI());

			if (!requestURI.endsWith("/portal/layout")) {
				return;
			}

			// Do not randomize layout unless the user is accessing a personal
			// layout

			Layout layout = themeDisplay.getLayout();

			if (layout == null) {
				return;
			}

			Group generalGuestGroup = GroupLocalServiceUtil.getGroup(
				themeDisplay.getCompanyId(), GroupConstants.GUEST);

			List<Layout> layouts = LayoutLocalServiceUtil.getLayouts(
				generalGuestGroup.getGroupId(), false);

			if (layouts.size() > 0) {
				Layout randomLayout = layouts.get(
					Randomizer.getInstance().nextInt(layouts.size()));

				themeDisplay.setLayout(randomLayout);
				themeDisplay.setLayoutTypePortlet(
					(LayoutTypePortlet)randomLayout.getLayoutType());

				request.setAttribute(WebKeys.LAYOUT, randomLayout);
			}
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new ActionException(e);
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		RandomLookAndFeelAction.class);

}