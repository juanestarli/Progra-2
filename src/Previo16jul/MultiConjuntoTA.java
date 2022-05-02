package Previo16jul;


public class MultiConjuntoTA implements MultiConjuntoTDA{

    class elemento {
        int info;
        int multi;}

    private elemento[] vector;
    private int cant;


    @Override
    public void InicializarMultiConjunto() {
        this.vector = new elemento[100];
        this.cant=0;
    }

    @Override
    public void Agregar(int x) {
        vector[cant] = new elemento();
        vector[cant].info= x;
        vector[cant].multi = Multiplicidad(x);
        cant++;
    }

    @Override
    public void Sacar(int x) {
        int i = cant-1;

        while (vector[i].info != x){
            i--;
        }

        vector[i] = vector[cant-1];
        cant--;
    }




    @Override
    public int Multiplicidad(int x) {
        int multi = 0;
        for (int i = 0; i<= cant-1; i++){
            if (vector[i].info == x){
                multi++;
            }
        }
        return multi;
    }


    @Override
    public boolean MultiConjuntoVacio() {
        return cant==0;
    }

    @Override
    public int Elegir() {
        return vector[cant].info;
    }
}
