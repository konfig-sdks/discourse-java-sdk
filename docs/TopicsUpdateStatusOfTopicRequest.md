

# TopicsUpdateStatusOfTopicRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**enabled** | [**EnabledEnum**](#EnabledEnum) |  |  |
|**until** | **String** | Only required for &#x60;pinned&#x60; and &#x60;pinned_globally&#x60; |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CLOSED | &quot;closed&quot; |
| PINNED | &quot;pinned&quot; |
| PINNED_GLOBALLY | &quot;pinned_globally&quot; |
| ARCHIVED | &quot;archived&quot; |
| VISIBLE | &quot;visible&quot; |



## Enum: EnabledEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



