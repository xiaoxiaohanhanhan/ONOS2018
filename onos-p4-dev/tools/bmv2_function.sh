#启动一个交换机
bmv2(){
	echo "输入格式:  bmv2 port"
	if [ $1 -eq 40012 ];then
		#使用 p4nmsg 40012 
		echo 40012 > /tmp/bmv2-40012-thrift-port
		$onos_p4_dev_ROOT/onos-bmv2/targets/simple_switch/simple_switch \
		--device-id 12 \
		-i 0@IR1-eth0 -i 1@IR1-eth1 -i 2@IR1-eth2\
		--thrift-port $1 \
		--nanolog ipc:///tmp/bmv2-12-log.ipc --debugger \
		--log-console -Lwarn $onos_p4_dev_ROOT/p4src/build/empty.json -- \
		--controller-ip 127.0.0.1 --controller-port 40123
		
	fi
	if [ $1 -eq 40013 ];then
		#使用 p4nmsg 40013 
		echo 40013 > /tmp/bmv2-40013-thrift-port
		$onos_p4_dev_ROOT/onos-bmv2/targets/simple_switch/simple_switch \
		--device-id 13 \
		-i 0@IR2-eth0 -i 1@IR2-eth1 -i 2@IR2-eth2 -i 3@IR2-eth3\
		--thrift-port $1 \
		--nanolog ipc:///tmp/bmv2-13-log.ipc --debugger \
		--log-console -Lwarn $onos_p4_dev_ROOT/p4src/build/empty.json -- \
		--controller-ip 127.0.0.1 --controller-port 40123
		
	fi

	if [ $1 -eq 40014 ];then
		#使用 p4nmsg 40013 
		echo 40014 > /tmp/bmv2-40014-thrift-port
		$onos_p4_dev_ROOT/onos-bmv2/targets/simple_switch/simple_switch \
		--device-id 14 \
		-i 0@IR3-eth0 -i 1@IR3-eth1\
		--thrift-port $1 \
		--nanolog ipc:///tmp/bmv2-14-log.ipc --debugger \
		--log-console -Lwarn $onos_p4_dev_ROOT/p4src/build/empty.json -- \
		--controller-ip 127.0.0.1 --controller-port 40123
		
	fi

	if [ $1 -eq 40017 ];then
		#使用 p4nmsg 40017
		echo 40017 > /tmp/bmv2-40017-thrift-port
		$onos_p4_dev_ROOT/onos-bmv2/targets/simple_switch/simple_switch \
		--device-id 17 \
		-i 0@AR1-eth0 -i 1@AR1-eth1 -i 2@AR1-eth2 -i 3@AR1-eth3 \
		--thrift-port $1 \
		--nanolog ipc:///tmp/bmv2-17-log.ipc --debugger \
		--log-console -Lwarn $onos_p4_dev_ROOT/p4src/build/empty.json -- \
		--controller-ip 127.0.0.1 --controller-port 40123
		
	fi
}
