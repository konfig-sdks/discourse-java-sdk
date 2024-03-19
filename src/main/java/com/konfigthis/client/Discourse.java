package com.konfigthis.client;

import com.konfigthis.client.api.AdminApi;
import com.konfigthis.client.api.BackupsApi;
import com.konfigthis.client.api.BadgesApi;
import com.konfigthis.client.api.CategoriesApi;
import com.konfigthis.client.api.GroupsApi;
import com.konfigthis.client.api.InvitesApi;
import com.konfigthis.client.api.NotificationsApi;
import com.konfigthis.client.api.PostsApi;
import com.konfigthis.client.api.PrivateMessagesApi;
import com.konfigthis.client.api.SearchApi;
import com.konfigthis.client.api.SiteApi;
import com.konfigthis.client.api.TagsApi;
import com.konfigthis.client.api.TopicsApi;
import com.konfigthis.client.api.UploadsApi;
import com.konfigthis.client.api.UsersApi;

public class Discourse {
    private ApiClient apiClient;
    public final AdminApi admin;
    public final BackupsApi backups;
    public final BadgesApi badges;
    public final CategoriesApi categories;
    public final GroupsApi groups;
    public final InvitesApi invites;
    public final NotificationsApi notifications;
    public final PostsApi posts;
    public final PrivateMessagesApi privateMessages;
    public final SearchApi search;
    public final SiteApi site;
    public final TagsApi tags;
    public final TopicsApi topics;
    public final UploadsApi uploads;
    public final UsersApi users;

    public Discourse() {
        this(null);
    }

    public Discourse(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.admin = new AdminApi(this.apiClient);
        this.backups = new BackupsApi(this.apiClient);
        this.badges = new BadgesApi(this.apiClient);
        this.categories = new CategoriesApi(this.apiClient);
        this.groups = new GroupsApi(this.apiClient);
        this.invites = new InvitesApi(this.apiClient);
        this.notifications = new NotificationsApi(this.apiClient);
        this.posts = new PostsApi(this.apiClient);
        this.privateMessages = new PrivateMessagesApi(this.apiClient);
        this.search = new SearchApi(this.apiClient);
        this.site = new SiteApi(this.apiClient);
        this.tags = new TagsApi(this.apiClient);
        this.topics = new TopicsApi(this.apiClient);
        this.uploads = new UploadsApi(this.apiClient);
        this.users = new UsersApi(this.apiClient);
    }

}
