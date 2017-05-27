package com.nok83r.designpatterns.creational.abstractFactory;


public class AbstractFactoryMain {


    public enum OS {
        LINUX(LinuxFactory.class),

        WIN(WinFactory.class);

        private Class clazz;

        OS(Class clazz) {
            this.clazz = clazz;
        }

        public Class getClazz() {
            return clazz;
        }

    }

    public static void run(OS os) {

        try {
            AbstractFactory factory = (AbstractFactory) os.LINUX.getClazz().newInstance();
            System.out.println(factory.createText().show());
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }


}
