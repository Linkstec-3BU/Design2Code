package test.blanco.cache;

import blanco.cache.BlancoCache;
import blanco.cache.BlancoCacheKey;

/**
 * メソッド・キャッシュのテスト。
 */
public abstract class AbstractCacheTester11 {
    /**
     * メソッド・キャッシュのテスト。
     * 
     * @param arg01
     * @return
     */
    @BlancoCache
    public String hello(@BlancoCacheKey final int arg01) {
        return "Hello: " + String.valueOf(arg01);
    }
}
