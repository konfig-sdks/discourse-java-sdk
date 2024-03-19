

# UploadsCreateNewUploadRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**userId** | **Integer** | required if uploading an avatar |  [optional] |
|**synchronous** | **Boolean** | Use this flag to return an id and url |  [optional] |
|**_file** | **File** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AVATAR | &quot;avatar&quot; |
| PROFILE_BACKGROUND | &quot;profile_background&quot; |
| CARD_BACKGROUND | &quot;card_background&quot; |
| CUSTOM_EMOJI | &quot;custom_emoji&quot; |
| COMPOSER | &quot;composer&quot; |



