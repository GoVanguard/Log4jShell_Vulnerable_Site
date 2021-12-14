# log4jShell Vulnerable Site

Warning: Do not use this for anything important! This website is intentionally vulnerable to CVE-2021-44228

The source code in this repository provides GoVanguard clients with a web application containing the Log4jShell Common Vulnerability and Exposures (CVE)-2021-44228. It is best practice to isolate this instance from all other corporate resources. Do not connect this resource to any resource group within your AzureAD, Amazon AWS, Google Cloud, IBM Cloud Compouting Provider, other remote, or prem Servers.

# TLDR

Start hosting vulnerable website:

```shell
sudo bash runIt.sh
```
Stop hosting vulnerable website:

```shell
sudo bash stopIt.sh
```

# Introduction
The Log4jShell vulnerability was initially discovered by Minecraft gaming enthusiasts during Thanksgiving Recess, which occurred sometime between 20-23 November 2021. AliBaba, Mitre, and