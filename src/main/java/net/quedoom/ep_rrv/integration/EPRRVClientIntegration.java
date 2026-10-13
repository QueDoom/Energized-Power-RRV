package net.quedoom.ep_rrv.integration;

import cc.cassian.rrv.api.ReliableRecipeViewerClientPlugin;
import cc.cassian.rrv.api.recipe.ItemView;

public class EPRRVClientIntegration implements ReliableRecipeViewerClientPlugin {
    @Override
    public void onIntegrationInitialize() {
        ItemView.addClientRecipeProvider(recipeList -> {

        });
    }
}
