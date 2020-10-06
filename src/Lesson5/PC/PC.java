package Lesson5.PC;

import Lesson5.PC.GraphicCard.GeforceFactory;
import Lesson5.PC.GraphicCard.GraphicCard;
import Lesson5.PC.GraphicCard.RadeonFactory;
import Lesson5.PC.GraphicCard.StandartCoolingStrategy;

public class PC {

    public static void main(String[] args) {
        ProcessorFactory processorFactory = new ProcessorFactory();
        Processor processor = processorFactory.createProcessor();

        HDDFactory hddFactory = new HDDFactory();
        DiscDrive hdd = hddFactory.createHDD();

        GeforceFactory geforceFactory = new GeforceFactory();
        GraphicCard geforce = geforceFactory.createGraphicCard();

        RamFactory ramFactory = new RamFactory();
        Ram ram = ramFactory.createRam();

        MonitorFactory monitorFactory = new MonitorFactory();
        Monitor monitor = monitorFactory.createMonitor();

        processor.printInfo();
        hdd.printInfo();
        geforce.printInfo();
        geforceFactory.cooling();
        ram.printInfo();
        monitor.printInfo();
    }

}
