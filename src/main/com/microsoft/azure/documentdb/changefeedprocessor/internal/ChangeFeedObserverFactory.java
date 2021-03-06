/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.microsoft.azure.documentdb.changefeedprocessor.internal;

import com.microsoft.azure.documentdb.changefeedprocessor.IChangeFeedObserver;
import com.microsoft.azure.documentdb.changefeedprocessor.IChangeFeedObserverFactory;
/**
 *
 * @author yoterada
 */

public class ChangeFeedObserverFactory<T extends IChangeFeedObserver> implements IChangeFeedObserverFactory {
    private final Class type;

    public ChangeFeedObserverFactory(Class type) {
        this.type = type;
    }

    @Override
    public IChangeFeedObserver createObserver() throws IllegalAccessException, InstantiationException {

        IChangeFeedObserver newInstance = null;
        newInstance = (IChangeFeedObserver) type.newInstance();


        return newInstance;
    }
}