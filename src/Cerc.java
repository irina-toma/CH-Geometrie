public class Cerc extends ObiectGeometric {
    private float raza;

    public Cerc(String culoare, float raza) {
        super(culoare);
        this.raza = raza;
    }

    @Override
    public float calculArie() {
        return (float) (Math.PI * this.raza * this.raza);
    }

    @Override
    public float calculPerimetru() {
        return (float) (2 * Math.PI * this.raza);
    }
}
