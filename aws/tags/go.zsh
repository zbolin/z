Go() {
    local image_id = ""
}
GetEc2InstanceIds() {

}
CreateImage() {
    local instance_id = $1
    local name = $2

}
CrateEc2() {
    local image_id = $1 # ami-xxxxxxxxx
    local key_name = $2 # MyKeyPair
    local security_group = $3 # sg-xxxxxx
    local subnet_id = $4 # subnet-xxxxxx
    local user_data = $5
    aws ec2 run-instances --image-id ami-xxxxxxxx --count 1 --instance-type t2.micro --key-name MyKeyPair --security-group-ids sg-903004f8 --subnet-id subnet-6e7f829e

}
