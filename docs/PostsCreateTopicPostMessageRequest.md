

# PostsCreateTopicPostMessageRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | Required if creating a new topic or new private message. |  [optional] |
|**raw** | **String** |  |  |
|**topicId** | **Integer** | Required if creating a new post. |  [optional] |
|**category** | **Integer** | Optional if creating a new topic, and ignored if creating a new post. |  [optional] |
|**targetRecipients** | **String** | Required for private message, comma separated. |  [optional] |
|**targetUsernames** | **String** | Deprecated. Use target_recipients instead. |  [optional] |
|**archetype** | **String** | Required for new private message. |  [optional] |
|**createdAt** | **String** |  |  [optional] |
|**replyToPostNumber** | **Integer** | Optional, the post number to reply to inside a topic. |  [optional] |
|**embedUrl** | **String** | Provide a URL from a remote system to associate a forum topic with that URL, typically for using Discourse as a comments system for an external blog. |  [optional] |
|**externalId** | **String** | Provide an external_id from a remote system to associate a forum topic with that id. |  [optional] |



