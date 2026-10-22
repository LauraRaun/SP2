public abstract class Title {
    protected String title;
    protected String literatureType;
    protected int copies;

    protected static final double Rate = 0.067574;

    //Rate er satsen målt i kr og øre pr. point.

    public Title(String title, String literatureType, int copies) {
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;

    }

    public double calculateRoyalty () {
        return calculatePoints() * Rate;

    //Her ganges satsen med points.

    }

    public abstract double calculatePoints();

    // Klassen er abstrakt, fordi de forskellige bogtyper beregner points forskelligt.

    public double convertLiteratureType() {
        switch (literatureType) {
            case "Bi":
                return 3.0;

            case "TE":
                return 3.0;

            case "LYRIK":
                return 6.0;

            case "SKØN":
                return 1.7;

            case "FAG":
                return 1.0;

            default:
                throw new IllegalArgumentException("Unknown literature type: " + literatureType);

            //Her får literaturtyperne tildelt deres værdier.
            //Det vil sige, hvis man låner Fagbog, så har bogen værdien 3.
        }
    }
}
