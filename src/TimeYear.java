public enum TimeYear {

    WINTER(-20){

    },
    SUMMER(20){
        @Override
        String getDescription(){
            return "Теплое время года";
        }
    },
    SPRING(5),
    AUTUMN(-5);
    int temp;
    TimeYear(int temp) {
        this.temp = temp;

    }
    String getDescription(){
        return "Холодное время года";
    }

}
