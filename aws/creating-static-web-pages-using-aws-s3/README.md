[#](#) Create S3 Bucket
Create an S3 bucket that begins with the name my-bucket
(e.g., my-bucket-<ACCOUNT ID>) in the us-east-1 region,
when creating the bucket,
remember to uncheck the S3 Block Public Access settings.

aws s3api create-bucket \
    --bucket 984351368928 \
    --region us-east-1


aws s3api delete-bucket --bucket [bucket-name]

aws s3 cp error.thml s3://[bucket-name]

aws s3 ls

aws s3 rm s3://984351368928/index.html

aws s3 website s3://my-bucket/ --index-document index.html --error-document error.html


# Start to Finish
acred
set-aws-key
CreateBucket my-bucket-account-key
GetBuckets | pbcopy
CopyFile BUCKET error.html
" index.html
" ListBucket
Website BUCKET
PutBucketPolicy BUCKET policy.json
"GetBucketPolicy
WebAddress BUCKET
