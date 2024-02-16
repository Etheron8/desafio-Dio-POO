import br.exemplo.desafio.POO.BootCamp;
import br.exemplo.desafio.POO.Curso;
import br.exemplo.desafio.POO.Dev;
import br.exemplo.desafio.POO.Mentorias;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso("Course Java", "Course java", 8);
        Curso curso2 = new Curso("Course C++", "Course C++", 12);

        Mentorias mentoria0 = new Mentorias("mentoria de java", "mentoria java", LocalDate.now());
        Mentorias mentoria1 = new Mentorias("mentoria de C++", "mentoria C++", LocalDate.now());

        BootCamp bootcamp = new BootCamp("Java Developer", "Bootcamp Java Developer");
        BootCamp bootcamp1 = new BootCamp("C++ Developer", "Bootcamp C++ Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria0);

        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);



        Map<Integer, BootCamp> listBootCamps = new HashMap<>();
        listBootCamps.put(1, bootcamp);
        listBootCamps.put(2, bootcamp1);



        Dev devName0 = new Dev("Felipe");
        Dev devName1 = new Dev("Lena");

        devName0.inscreverBootCamps(bootcamp1);
        devName1.inscreverBootCamps(bootcamp);

        devName0.progredir();
        System.out.println("\n\t Total BootCamps:" + listBootCamps.size() + "\n\t");
        for (Map.Entry<Integer, BootCamp> entry : listBootCamps.entrySet()){

            System.out.println("[" + entry.getKey() + "] = " + "BootCamp Name:"+ entry.getValue().getName() +
                    "\n\tStart Date:"+ entry.getValue().getDataInicial() + "\n\tEnd Date:" + entry.getValue().getDataFinal() +
                    "\n\tDevsIncritos::"+ entry.getValue().getDevInscritos().size() + "\n\t Content:" + entry.getValue().getConteudos() );
        }




        Map<String, Double> listDevs = new TreeMap<>();

        listDevs.put(devName0.getNome(), devName0.calcularTotalXp());
        listDevs.put(devName1.getNome(), devName1.calcularTotalXp());


        System.out.println("\n\tDevs Registered for bootCamp: " + listDevs.size() + "\n\t");
        for (Map.Entry<String, Double> entry : listDevs.entrySet()){
            System.out.println("\tDev Name:" + entry.getKey() + "\n\tDev EXp:" + entry.getValue() + "\n");

        }


        System.out.println("\t------------------\t");
        System.out.println("Dev:"+ devName0.getNome() + " Content Registered:" + devName0.getConteudosInscritos());
        System.out.println("\t------------------\t");
        System.out.println("Dev:"+ devName1.getNome() + " Content Registered:" + devName1.getConteudosInscritos());


    }

}
