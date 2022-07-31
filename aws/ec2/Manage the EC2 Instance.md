Once the instance is running with 2/2 status checks:

Copy the instance's public DNS (IPv4), and paste it into a new browser tab.
On the EC2 instances console, right-click the instance, and select Connect.
In the terminal, change to your downloads directory (e.g., cd Downloads).
Run chmod 400 Lab.pem to adjust the permissions on the file.
If using Windows, you will need to follow the instructions found here.
Connect to the instance using the ssh command provided in the dialog when you click Connect (or using the PuTTY instructions).
Note the IPv4 public IP of the instance.
With the instance selected, click Actions > Instance State > Reboot.
Does the IP change?
Click Actions > Instance State > Stop.
After it's stopped, click Actions > Instance State > Start.
Does the IP change?
Click Actions > Instance State > Stop.
Once it's stopped, click Actions > Instance Settings > Change Instance Type.
Change the instance type to t3.small, and click Apply.
