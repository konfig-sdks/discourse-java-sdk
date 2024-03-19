

# InvitesCreateMultipleInvitesRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**email** | **String** | pass 1 email per invite to be generated. other properties will be shared by each invite. |  [optional] |
|**skipEmail** | **Boolean** |  |  [optional] |
|**customMessage** | **String** | optional, for email invites |  [optional] |
|**maxRedemptionsAllowed** | **Integer** | optional, for link invites |  [optional] |
|**topicId** | **Integer** |  |  [optional] |
|**groupIds** | **String** | Optional, either this or &#x60;group_names&#x60;. Comma separated list for multiple ids. |  [optional] |
|**groupNames** | **String** | Optional, either this or &#x60;group_ids&#x60;. Comma separated list for multiple names. |  [optional] |
|**expiresAt** | **String** | optional, if not supplied, the invite_expiry_days site setting is used |  [optional] |



