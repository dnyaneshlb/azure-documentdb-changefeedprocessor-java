package com.microsoft.azure.documentdb.changefeedprocessor.internal;

import java.util.List;

/**
*
* @author rogirdh
*/

final class Unsubscriber<T extends Lease> implements IDisposable {

        final List<IPartitionObserver<T>> observers;
        final IPartitionObserver<T> observer;

        Unsubscriber(List<IPartitionObserver<T>> observers, IPartitionObserver<T> observer){
        this.observers = observers;
        this.observer = observer;
        }

    public void Dispose()
    {
        if (this.observers.contains(this.observer))
        {
            this.observers.remove(this.observer);
        }
    }

};

