# Mention Liferay Users from custom/OOTB modules of Liferay
#### Mention users from HTML editor of Liferay
- We have cool settings for this, using that we can enable mention feature for the required criteria
-- We can define these criteria from the MentionConfigContributor of this module.
>property = {
			"editor.config.key=messageHTML", // only for inputs with this name
			"editor.name=alloyeditor", "editor.name=alloyeditor_bbcode",
			"editor.name=ckeditor", "editor.name=ckeditor_bbcode", // only for inputs with this editorName
			"javax.portlet.name=" + MentionUsersWebPortletKeys.MENTION_USERS_WEB_PORTLET_KEY, // only enable mention for this portlet
			"service.ranking:Integer=10"
		}
---
>property = {
			"editor.name=alloyeditor", "editor.name=alloyeditor_bbcode",
			"editor.name=ckeditor", "editor.name=ckeditor_bbcode",
			"service.ranking:Integer=10"
		}
