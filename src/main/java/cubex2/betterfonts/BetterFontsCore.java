package cubex2.betterfonts;

import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

import java.io.File;
import java.util.Map;

@IFMLLoadingPlugin.MCVersion("1.8.9")
public class BetterFontsCore implements IFMLLoadingPlugin
{
    public static File location;

    @Override
    public String[] getASMTransformerClass()
    {
        return new String[]{BFClassTransformer.class.getName()};
    }

    @Override
    public String getModContainerClass()
    {
        return BFDummyContainer.class.getName();
    }

    @Override
    public String getSetupClass()
    {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data)
    {
        location = (File) data.get("coremodLocation");
    }

    @Override
    public String getAccessTransformerClass()
    {
        return null;
    }
}
