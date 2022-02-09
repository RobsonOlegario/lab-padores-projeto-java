package one.digital.innovattion.gof;

import one.digital.innovattion.gof.facade.Facade;
import one.digital.innovattion.gof.singleton.SingletonEager;
import one.digital.innovattion.gof.singleton.SingletonLazy;
import one.digital.innovattion.gof.singleton.SinlgetonLazyHolder;
import one.digital.innovattion.gof.strategy.*;

public class Test {

    public static void main(String[] args) {

     // Singleton
        SingletonLazy Lazy = SingletonLazy.getInstancia();
        System.out.println(Lazy);
        Lazy = SingletonLazy.getInstancia();
        System.out.println(Lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SinlgetonLazyHolder holder = SinlgetonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SinlgetonLazyHolder.getInstancia();
        System.out.println(holder);


    // Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new comportamentonormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();

        //facade


        Facade facade = new Facade();
        facade.migrarCliente("Robson", "2888989");
            }
        }


