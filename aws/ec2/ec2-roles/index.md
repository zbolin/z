# Create a Trust Policy and Role Using the AWS CLI
From the AWS Management Console, open the provisioned S3 bucket with s3bucketlookupfiles in its name and obtain the labreferences.txt file. This file serves as a reference containing the S3 bucket names used throughout the lab.
Open a new terminal session.
Log in to the EC2 Bastion Host instance using the provided lab credentials and set the AWS CLI region and output type.
Create an IAM trust policy for an EC2 role.
Create an IAM role named DEV_ROLE.
Create an IAM policy named DevS3ReadAccess and define read-only access permissions for the provisioned S3 bucket with s3bucketdev in its name .

# Create Instance Profile and Attach Role to an EC2 Instance
Attach the DevS3ReadAccess policy to the DEV role.
Create the instance profile DEV_PROFILE and add the DEV_ROLE to it via the AWS CLI.
Attach the DEV_PROFILE role to the EC2 Web Server instance.

# Test S3 Permissions via the AWS CLI
Log in to the EC2 Web Server instance using the provided lab credentials.
Verify that the Web Server instance is assuming the DEV_ROLE role.
List the buckets in the account.
Attempt to view the files in the s3bucketdev bucket.

# Create an IAM Policy and Role Using the AWS Management Console
From the AWS Management Console, navigate to IAM > Policies.
Create an IAM policy named ProdS3ReadAccess and define read-only access permissions for the provisioned S3 bucket with s3bucketprod in its name .
Create a PROD_ROLE role and attach it to the ProdS3ReadAccess policy.

# Attach IAM Role to an EC2 Instance Using the AWS Management Console
Navigate to EC2 > Instances.
Attach the PROD_ROLE role to the Web Server instance.
Open a terminal session and log in to the EC2 Web Server instance using the provided lab credentials.
Verify that the Web Server instance is assuming the PROD_ROLE.
List the buckets.
Attempt to view the files in the s3bucketprod bucket.
Attempt to view the files in the s3bucketsecret bucket.
