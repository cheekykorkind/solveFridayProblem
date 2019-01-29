﻿@ECHO off
REM make samba folder
SET sharedFolder=C:\Users\IEUser\Desktop\work
if not exist "%sharedFolder%" mkdir %sharedFolder%
net share Works=%sharedFolder% /grant:everyone,FULL /users:10

REM samba setting part
REM Turn on network discovery
netsh advfirewall firewall set rule group="Network Discovery" new enable=Yes
REM Turn on file and printer sharing
netsh advfirewall firewall set rule group="File and Printer Sharing" new enable=Yes

REM Turn on below MANUALLY 
REM Turn on sharing so anyone with network access can read write files in the Pulbic folders

REM choco install
@"%SystemRoot%\System32\WindowsPowerShell\v1.0\powershell.exe" -NoProfile -InputFormat None -ExecutionPolicy Bypass -Command "iex ((New-Object System.Net.WebClient).DownloadString('https://chocolatey.org/install.ps1'))" && SET "PATH=%PATH%;%ALLUSERSPROFILE%\chocolatey\bin"
choco upgrade chocolatey

choco install jdk8 -y
choco install maven -y
setx Path "C:\ProgramData\chocolatey\lib\jdk8\toolsC:\ProgramData\chocolatey\lib\jdk8\tools;%Path%" -m

REM git bash install part
choco install git.install -y

REM git bash command set up part
Call %~dp0\personalGitSetUp.bat

REM notepad++ install part
choco install notepadplusplus.install -y

REM googlechrome install
choco install googlechrome -y

python -m pip install win-unicode-console

REM Japanese language pack download. if it fail, you need to check below
REM 1. Control Panel -> Clock, Language, and Region -> Language -> Language options -> Japanese -> Download and install language pack -> show details
"C:\Windows\system32\lpkinstall.exe" 9d4e7905-1ee9-4fe0-aa7d-0e9dcf581545

REM Set system locale JP
control.exe intl.cpl,, /f:"%sharedFolder%\languagePack.xml"