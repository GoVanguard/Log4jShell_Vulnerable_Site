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
The Log4jShell vulnerability was initially discovered by Minecraft gaming enthusiasts during Thanksgiving Recess, which occurred sometime between 20-23 November 2021. A researchr with AliBaba's Cloud Security Team reported the vulnerability to Apache on 24 November 2021. MITRE assigned this vulnerability CVE-2021-44228 on 26 November 2021, which was still being used in the Minecraft gaming community. Unfortunately, The Apache Software Foundation did not prioritize mitigating the vulnerability during Thanksgiving Recess. It is very likely that many members of their incident response team were on holiday because The Apache Software Foundation uses grants to hire academic researchers and open source users to maintain their code base. The impact to both parties involved would be greater during the college Holiday Recess. 

On Friday 9 December 2021, the GitHub user TangXiaFeng7 published the source code for the Minimum Viable Product (MVP) for this exploit online at 10:32AM 9 November 2021. Minutes after this publication hit the internet the exploit became weaponized. This exploit is baked in to many web applications because it is a component of Java. It affects almost all software systems in the industry at the Application and Session layers. The Apache Software Foundation's team of researchers delegated to incident response rapidly developed code to mitigate the problem. Initial commits that indicate The Apache Software Foundation was debugging the vulnerability hit the internet at 12:38PM 9 November 2021. Within eight hours of the MVP hitting the internet The Apache Software Foundation fixed the vulnerability at 18:23 9 November 2021. However, where there incident response team ends their work is our work begin. 
