public abstract class ObiectGeometric {
    protected String culoare;

    public ObiectGeometric(String culoare) {
        this.culoare = culoare;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public abstract float calculArie();

    public abstract float calculPerimetru();
}
