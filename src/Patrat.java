public class Patrat extends ObiectGeometric {
    private float latura;

    public Patrat(String culoare, float latura) {
        super(culoare);
        this.latura = latura;
    }

    @Override
    public float calculArie() {
        return this.latura * this.latura;
    }

    @Override
    public float calculPerimetru() {
        return 4 * this.latura;
    }
}
