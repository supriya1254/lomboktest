package com.lombok;

import java.util.HashMap;
import java.util.Map;

class oldLazyMethod
{
    private static Map<CarType, oldLazyMethod> types = new HashMap<CarType, oldLazyMethod>();

    private oldLazyMethod(CarType type) {}

    public static oldLazyMethod getCarByTypeName(CarType type)
    {
        oldLazyMethod oldLazyMethod;

        if (!types.containsKey(type)) {
            // Lazy initialisation
            oldLazyMethod = new oldLazyMethod(type);
            types.put(type, oldLazyMethod);
        } else {
            // It's available currently
            oldLazyMethod = types.get(type);
        }

        return oldLazyMethod;
    }

    public static oldLazyMethod getCarByTypeNameHighConcurrentVersion(CarType type)
    {
        if (!types.containsKey(type)) {
            synchronized(types)
            {
                // Check again, after having acquired the lock to make sure
                // the instance was not created meanwhile by another thread
                if (!types.containsKey(type)) {
                    // Lazy initialisation
                    types.put(type, new oldLazyMethod(type));
                }
            }
        }

        return types.get(type);
    }

    public static void showAll()
    {
        if (types.size() > 0) {

            System.out.println("Number of instances made = " + types.size());

            for (Map.Entry<CarType, oldLazyMethod> entry : types.entrySet()) {
                String Car = entry.getKey().toString();
                Car = Character.toUpperCase(Car.charAt(0)) + Car.substring(1);
                System.out.println(Car);
            }

            System.out.println();
        }
    }
}
