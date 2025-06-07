package Java15;

// in previous versions we knew only string where was exception. Now we have
public class NullPointerExceptionHandle {
    public static void main(String[] args) {
        // Now with this code we will get exception with info "Java15.NullPointerExceptionHandle$Programmer.getComputer()" is null
        //	at Java15.NullPointerExceptionHandle.main(NullPointerExceptionHandle.java:10)
        Programmer programmer = new Programmer();
        programmer.setComputer(null);
        programmer.getComputer().getGraphicsCard();
    }

    static class Programmer {
        private Computer computer;

        public Computer getComputer() {
            return computer;
        }

        public void setComputer(Computer computer) {
            this.computer = computer;
        }
    }

    static class Computer {
        private String motherboard;
        private String graphicsCard;
        private String HDD;

        public String getMotherboard() {
            return motherboard;
        }

        public void setMotherboard(String motherboard) {
            this.motherboard = motherboard;
        }

        public String getGraphicsCard() {
            return graphicsCard;
        }

        public void setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
        }

        public String getHDD() {
            return HDD;
        }

        public void setHDD(String HDD) {
            this.HDD = HDD;
        }
    }
}
