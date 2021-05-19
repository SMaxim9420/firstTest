cmd /C start java -jar selenium-server-standalone-3.141.59.jar -role hub

cmd /C start java -jar selenium-server-standalone-3.141.59.jar -role node -port 5555 -hub http://localhost:4444/grid/register -nodeConfig NodeConfig1.json

cmd /C start java -jar selenium-server-standalone-3.141.59.jar -role node -port 5556 -hub http://localhost:4444/grid/register -nodeConfig NodeConfig2.json