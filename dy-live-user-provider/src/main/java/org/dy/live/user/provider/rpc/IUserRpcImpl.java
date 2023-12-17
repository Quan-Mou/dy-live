package org.dy.live.user.provider.rpc;

import org.apache.dubbo.config.annotation.DubboService;
import org.dy.live.user.interfaces.IUserRpc;

@DubboService
public class IUserRpcImpl implements IUserRpc {
    @Override
    public String test() {
        System.out.println("this run server");
        return "test";
    }
}
