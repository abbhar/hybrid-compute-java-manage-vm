package com.microsoft.azure.management.compute.samples;

import com.microsoft.rest.ServiceCallback;

public class VMCreationCallBack<VirtualMachine> implements ServiceCallback<VirtualMachine>
{

    @Override
    public void failure(Throwable throwable) {
        System.out.println("Creating Vm failed with error " + throwable.getMessage() + throwable.toString());
        System.out.println("Creating Vm failed with error " + throwable.getStackTrace());
    }

    @Override
    public void success(VirtualMachine virtualMachine) {
        System.out.println("Creating Vm suceded, VM details- " + virtualMachine.toString());
    }
}
