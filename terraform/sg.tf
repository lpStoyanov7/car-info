resource "aws_security_group" "worker_group_http" {
  name_prefix = "worker_group_one"
  vpc_id      = module.vpc.vpc_id
  ingress {
    from_port   = 80
    to_port     = 80
    protocol    = "tcp"
    cidr_blocks = [
      "10.0.0.0/8"
    ]
  }
}
resource "aws_security_group" "worker_group_https" {
  name_prefix = "worker_group_two"
  vpc_id      = module.vpc.vpc_id

  ingress {
    from_port   = 443
    to_port     = 443
    protocol    = "tcp"
    cidr_blocks = [
      "10.0.0.0/8"
    ]
  }
}
