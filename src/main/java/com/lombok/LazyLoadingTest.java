package com.lombok;

    enum CarType {
        none,
        Audi,
        BMW,
    }

 public class LazyLoadingTest {
        public static void main(String[] args)
        {
            oldLazyMethod.getCarByTypeName(CarType.BMW);
            oldLazyMethod.showAll();
            oldLazyMethod.getCarByTypeName(CarType.Audi);
            oldLazyMethod.showAll();
            oldLazyMethod.getCarByTypeName(CarType.BMW);
            oldLazyMethod.showAll();
            oldLazyMethod.getCarByTypeName(CarType.none);
            oldLazyMethod.showAll();
            oldLazyMethod.getCarByTypeName(CarType.none);
            oldLazyMethod.showAll();
        }
    }

