

# UploadsInitiateDirectExternalUploadResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | **String** | The path of the temporary file on the external storage service. |  [optional] |
|**url** | **String** | A presigned PUT URL which must be used to upload the file binary blob to. |  [optional] |
|**signedHeaders** | **Object** | A map of headers that must be sent with the PUT request. |  [optional] |
|**uniqueIdentifier** | **String** | A unique string that identifies the external upload. This must be stored and then sent in the /complete-external-upload endpoint to complete the direct upload. |  [optional] |



