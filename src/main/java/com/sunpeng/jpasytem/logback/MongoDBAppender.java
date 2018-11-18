package com.sunpeng.jpasytem.logback;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.UnsynchronizedAppenderBase;
import com.mongodb.BasicDBObject;
import com.sunpeng.jpasytem.mongodb.ApplicationContextProvider;
import org.springframework.data.mongodb.core.MongoTemplate;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MongoDBAppender extends UnsynchronizedAppenderBase<ILoggingEvent> {
    @Override
    protected void append(ILoggingEvent eventObject) {
        MongoTemplate mongoTemplate = ApplicationContextProvider.getBean(MongoTemplate.class);
        if (mongoTemplate != null) {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            final BasicDBObject doc = new BasicDBObject();
            doc.append("date", df.format(new Date()));
            doc.append("level", eventObject.getLevel().toString());
            doc.append("logger", eventObject.getLoggerName());
            doc.append("thread", eventObject.getThreadName());
            doc.append("message", eventObject.getFormattedMessage());
            mongoTemplate.insert(doc, "log");

        }
    }
}
