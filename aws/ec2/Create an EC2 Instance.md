Navigate to EC2 > Instances.
Click Launch instance.
On the AMI page, select the Amazon Linux 2 AMI.
1.Set the instance type as a t2.micro selected, and click Next: Configure Instance Details.

On the Configure Instance Details page:

Network: default
Subnet: No preference
Auto-assign Public IP: Enable
Expand Advanced details, and paste the following into the user data box:

    #!/bin/bash
    yum update -y
    yum install -y httpd
    yum install -y curl
    chkconfig httpd on
    service httpd start

Click Next: Add Storage, and then click Next: Add Tags.

On the Add Tags page, select Add Tag then add the following:

Key: Name
Value: Webserver
Click Next: Configure Security Group.

On the Configure Security Group page, click Create a new security group, and set the following values:

Security group name: LabSG
Description: LabSG
Click Add Rule, and set the following values (leave the default SSH rule):

Type: HTTP
Source: My IP
Click Review and Launch, and then Launch.

In the key pair dialog, select Create a new key pair.

Give it a Key pair name of "Lab".

Click Download Key Pair, and then Launch Instances.

Click View Instances, and give it a few minutes to enter the running state.
