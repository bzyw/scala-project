package org.bzyw.train.service;

import org.bzyw.train.model.DBMetaData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MetaDataServiceTest {

    @Autowired
    MetaDataService service;

    @Test
    public void testSave() {
        DBMetaData metaData = new DBMetaData();
        metaData.setName("default");
        metaData.setLocation("hdfs://master:9000/user/hive/warehouse");
        service.save(metaData);
    }

    @Test
    public void queryTest() {
        Iterable<DBMetaData> data = service.query();
        for (DBMetaData item : data) {
            System.out.println("id:" + item.getId() + ",name:" + item.getName() + ",location:" + item.getLocation());
        }
    }
}
