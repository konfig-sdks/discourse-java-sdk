

# UploadsCreateMultipartExternalUploadResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | **String** | The path of the temporary file on the external storage service. |  |
|**externalUploadIdentifier** | **String** | The identifier of the multipart upload in the external storage provider. This is the multipart upload_id in AWS S3. |  |
|**uniqueIdentifier** | **String** | A unique string that identifies the external upload. This must be stored and then sent in the /complete-multipart and /batch-presign-multipart-parts endpoints. |  |



