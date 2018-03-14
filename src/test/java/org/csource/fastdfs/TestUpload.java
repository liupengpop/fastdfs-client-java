/*
 * Gsoft开发框架
 * Copyright 2015-2020 the original author or authors.
 */

package org.csource.fastdfs;

import java.io.IOException;

import org.csource.common.MyException;

/**
 * TODO (描述该文件做什么)
 * @author LiuPeng
 * @date 2018年3月12日
 *  
 */
public class TestUpload {
	public static void main(String[] args) throws IOException, MyException {
		String trackerServers = "192.168.139.151:22122,192.168.139.152:22122";
	    ClientGlobal.initByTrackers(trackerServers);
	    // 3、创建一个TrackerClient对象。
        TrackerClient trackerClient = new TrackerClient();
        // 4、创建一个TrackerServer对象。
        TrackerServer trackerServer = trackerClient.getConnection();
        // 5、声明一个StorageServer对象，null。
        StorageServer storageServer = null;
        // 6、获得StorageClient对象。
        StorageClient storageClient = new StorageClient(trackerServer,  storageServer);
        // 7、直接调用StorageClient对象方法上传文件即可。
        String[] strings = storageClient.upload_file("group0","E:/程序安装包/10203_vista_w2k8_x86_production_db.rar", "rar", null);
        for (String string : strings) {
            System.out.println(string);
        }
	}
}
