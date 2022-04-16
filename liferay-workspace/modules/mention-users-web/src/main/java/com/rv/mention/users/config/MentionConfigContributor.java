package com.rv.mention.users.config;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.editor.configuration.EditorConfigContributor;
import com.rv.mention.users.web.constants.MentionUsersWebPortletKeys;

@Component(
		immediate = true,
		property = {
			"editor.config.key=messageHTML",
			"editor.name=alloyeditor", "editor.name=alloyeditor_bbcode",
			"editor.name=ckeditor", "editor.name=ckeditor_bbcode",
			"javax.portlet.name=" + MentionUsersWebPortletKeys.MENTION_USERS_WEB_PORTLET_KEY,
			"service.ranking:Integer=10"
		},
		service = EditorConfigContributor.class
	)
public class MentionConfigContributor extends BaseMentionConfigContributor {
	
}
