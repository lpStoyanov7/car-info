module "eks" {
  source          = "terraform-aws-modules/eks/aws"
  version         = "19.5.1"
  cluster_name    = local.cluster_name
  cluster_version = "1.20"
  subnet_ids      = module.vpc.private_subnets
  tags            = {
    Name = "CarInfo-EKS-Cluster"
  }
  vpc_id        = module.vpc.vpc_id
}

#data "aws_eks_cluster" "cluster" {
#  name = module.eks.cluster_id
#}
#data "aws_eks_cluster_auth" "cluster" {
#  name = module.eks.cluster_id
#}