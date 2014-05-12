
# Logging to syslog

Direct ```local5``` messages to separate log file:
```
# sudo vim /etc/syslog.conf
local5.*	/var/log/local5.log

Enable syslog to accept remote logging:
```
# sudo vim /System/Library/LaunchDaemons/com.apple.syslogd.plist
# add thius at the end of the file
	<key>NetworkListener</key>
	<dict>
		<key>SockServiceName</key>
		<string>syslog</string>
		<key>SockType</key>
		<string>dgram</string>
	</dict>
```


Reload changes
```
sudo launchctl unload /System/Library/LaunchDaemons/com.apple.syslogd.plist
sudo launchctl load /System/Library/LaunchDaemons/com.apple.syslogd.plist
sudo killall -9 syslogd
```

Verify the app is logging to syslog:
``
sudo tcpdump -i lo0
sudo killall -9 syslogd
```

Verify log messages are going through:
```
less /var/log/local5.log
```
