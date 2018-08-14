package com.vcredit.elasticjobdemo.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author zhouliliang
 * @Description:
 * @Date: Created in 2018/8/14 16:58
 */
@Slf4j
public class MyElasticJob implements SimpleJob {

    @Override
    public void execute(ShardingContext context) {
        switch (context.getShardingItem()) {
            case 0:
                // do something by sharding item 0
                log.info("" + context.getShardingItem() + "," + context.getShardingTotalCount() + "," + context.getShardingParameter());
                break;
            case 1:
                // do something by sharding item 1
                log.info("" + context.getShardingItem() + "," + context.getShardingTotalCount() + "," + context.getShardingParameter());
                break;
            case 2:
                // do something by sharding item 2
                log.info("" + context.getShardingItem() + "," + context.getShardingTotalCount() + "," + context.getShardingParameter());
                break;
            // case n: ...
        }
    }
}
