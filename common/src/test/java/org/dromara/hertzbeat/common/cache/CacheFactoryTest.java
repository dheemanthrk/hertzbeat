package org.dromara.hertzbeat.common.cache;

import org.dromara.hertzbeat.common.cache.CacheFactory;
import org.dromara.hertzbeat.common.cache.ICacheService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CacheFactoryTest {

    @Test
    public void testGetNoticeCache() {
        // Get the notice cache from the CacheFactory
        ICacheService<String, Object> noticeCache = CacheFactory.getNoticeCache();

        // Ensure that the noticeCache is not null
        assertNotNull(noticeCache);

        // Perform additional assertions or tests on the noticeCache if needed
    }

    @Test
    public void testGetAlertSilenceCache() {
        // Get the alert silence cache from the CacheFactory
        ICacheService<String, Object> alertSilenceCache = CacheFactory.getAlertSilenceCache();

        // Ensure that the alertSilenceCache is not null
        assertNotNull(alertSilenceCache);

        // Perform additional assertions or tests on the alertSilenceCache if needed
    }

    @Test
    public void testGetAlertConvergeCache() {
        // Get the alert converge cache from the CacheFactory
        ICacheService<String, Object> alertConvergeCache = CacheFactory.getAlertConvergeCache();

        // Ensure that the alertConvergeCache is not null
        assertNotNull(alertConvergeCache);

        // Perform additional assertions or tests on the alertConvergeCache if needed
    }
}
