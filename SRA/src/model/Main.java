
package model;

import java.util.ArrayList;

/**
 *Classe responsável pela recomendação de pessoas
 * 
 * @author VAIO
 */
public class Main {

    public static void main(String[] args) {
<<<<<<< HEAD
        Conexão conexão = new Conexão();
        conexão.conectBD();
        ArrayList<Vertice> list = conexão.listaVertice();
=======
        //Conexão conexão = new Conexão();
        //conexão.conectBD();
        //ArrayList<Pessoa> list = conexão.listaPessoa();
>>>>>>> main

       //Rede rede = new Rede(list.size());

      Pessoa p1 = new Pessoa("rodrigo",17, "santos", "M", "musculação","romance","medio");
      Pessoa p2 = new Pessoa("lucas",34, "palmeiras", "F","pintura","romance","superior");

<<<<<<< HEAD
        for (int i=0;i< list.size();i++){
            rede.adicionarVertice(list.get(i).getPessoa());
=======
       /** for (int i=0;i< list.size();i++){
            rede.adicionarVertice(list.get(i));
>>>>>>> main

        }
        rede.adicionarAresta(list.get(5),list.get(1));
        rede.adicionarAresta(list.get(6),list.get(5));
        rede.adicionarAresta(list.get(5),list.get(1));
        rede.adicionarAresta(list.get(1),list.get(7));
        rede.adicionarAresta(list.get(1),list.get(4));
        rede.adicionarAresta(list.get(7),list.get(3));
        rede.adicionarAresta(list.get(4),list.get(3));
        rede.adicionarAresta(list.get(4),list.get(8));
        rede.adicionarAresta(list.get(8),list.get(9));
        rede.adicionarAresta(list.get(9),list.get(3));
        rede.adicionarAresta(list.get(3),list.get(2));
        rede.adicionarAresta(list.get(9),list.get(0));
        rede.adicionarAresta(list.get(0),list.get(2));





        rede.imprimirMapa();
        System.out.println("\n");
       rede.imprimir();
        System.out.println("\n");

        for (int i=0;i< list.size();i++){
            System.out.println("Amigos de "+list.get(i).getPessoa().getNome()+"["+ list.indexOf(list.get(i)) +"]"+ ": ");
            System.out.println(rede.listarAmizades(list.get(i).getPessoa()));
            System.out.println("\n");
        }

<<<<<<< HEAD

            ArrayList<Vertice> caminho=rede.encontrarMenorCaminhoDijkstra(list.get(0),list.get(7));
        for (int i=0;i< caminho.size();i++) {
            System.out.println(caminho.get(i).getPessoa().getNome());
        }

=======
     */
>>>>>>> main
    }

    
}
