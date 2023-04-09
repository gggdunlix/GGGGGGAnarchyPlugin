package ml.gggrealms.gggmcanarchy;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import net.kyori.adventure.util.HSVLike;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;

public class Lang {
    public TextColor errorRed = TextColor.color(210, 11, 37);
    public String opJoinMessage = "Ops can spawn as dev class to spawn creative mode.";
    public Component dataLoadedFromSave = Component.text("Data loaded, welcome back!", TextColor.color(254, 214, 69));
    public Component noDataLoadedMessage = Component.text("No data saved, did you not use /savequit?", TextColor.color(HSVLike.fromRGB(255, 35, 10)));

    public Component autoSpawnWarning(FileConfiguration cfg, String path) {
        int asSeconds = cfg.getInt(path);
        return Component.text("Automatically spawning as default in ", TextColor.color(0x389495)).append(Component.text(asSeconds, TextColor.color(0xFFA503)).append(Component.text(" seconds.", TextColor.color(0x389495))));
    }
    public Component autoRespawnWarning(int rate) {
        return Component.text("Automatically spawning as default in ", TextColor.color(0x389495)).append(Component.text(rate, TextColor.color(0xFFA503)).append(Component.text("seconds. (/as to change)", TextColor.color(0x389495))));
    }
    public String scoreboardTitle = "AnarCraft";
    public String stashSaved = "Saved stash.";

    public Component blockedFriendlyFire = Component.text("Blocked friendly fire.", errorRed);

    public double upkeepFactor = .005;
    public double maxSafeFactor = 2.5;

    World w = Bukkit.getWorld("world");

    public PropertyInfo motel = new PropertyInfo(5000, "Motel", new String[]{"classCrackhead", "classEmployee"});
    public PropertyInfo cheapApartment = new PropertyInfo(20000,  "Cheap Apartment", new String[]{"classThug"});
    public PropertyInfo farm = new PropertyInfo(150000,  "Farm", new String[]{"classHorseman"});
    public PropertyInfo opalHotel = new PropertyInfo(200000, "Opal Hotel", new String[]{"classDrugSlinger", "classGunsmith"});
    public PropertyInfo usBankOffice = new PropertyInfo(300000,  "US Bank Office", new String[]{"classBankRobber"});
    public PropertyInfo rooseveltResidence = new PropertyInfo(500000,  "Roosevelt Residence", new String[]{"classInvestor", "classBanker"});
    public PropertyInfo docksOffice = new PropertyInfo(650000,  "Opal Hotel", new String[]{"classDrugSlinger", "classGunsmith"});
    public PropertyInfo bunker = new PropertyInfo(1000000,  "Bunker", new String[]{"classHeister"});
    public PropertyInfo casino = new PropertyInfo(50000000,  "Casino", new String[]{"classPilot", "classAgent"});

    public PropertyInfo[] allProps = new PropertyInfo[]{motel,cheapApartment,farm,opalHotel,usBankOffice,rooseveltResidence,docksOffice,bunker,casino};

    public PropertyPos motelPos = new PropertyPos(motel, new Location(w, 00,00,00),new Location(w, 00,00,00),new Location(w, 00,00,00),new Location(w, 00,00,00),new Location(w, 00,00,00),new Location(w, 00,00,00));
    public PropertyPos cheapApartmentPos = new PropertyPos(cheapApartment,  new Location(w, 830, 76, -933), new Location(w, 829, 72, -934),new Location(w, 826, 73, -933),new Location(w, 827, 74, -933), new Location(w, 826, 72, -934),new Location(w, 830, 73, -933));
    public PropertyPos farmPos = new PropertyPos(farm, new Location(w, 1051,65,-669), new Location(w, 1048,62,-672), new Location(w, 1037, 71, -678), new Location(w, 1037,72,-678), new Location(w, 1036,70,-680), new Location(w, 1048, 63, -670));
    public PropertyPos usBankOfficePos = new PropertyPos(usBankOffice,new Location(w, 924,92,-929), new Location(w, 922,88,-930),new Location(w, 920, 89, -929),new Location(w, 920,90,-929), new Location(w, 919,88,-930),new Location(w, 923, 89, -929));
    public PropertyPos docksOfficePos = new PropertyPos(docksOffice,new Location(w, 684, 72, -830), new Location(w, 682, 69, -832),new Location(w, 683, 70, -827),new Location(w, 684, 72, -826), new Location(w, 682, 69, -828),new Location(w, 683, 70, -831));
    public PropertyPos bunkerPos = new PropertyPos(bunker, new Location(w, 762,69,-599), new Location(w, 756,66,-601),new Location(w, 759, 58, -608), new Location(w, 760,60,-607), new Location(w, 758,57,-609),new Location(w, 759.5,67,-599.5));

    public PropertyPos[] allPropPoses = {motelPos,cheapApartmentPos,farmPos,usBankOfficePos,docksOfficePos,bunkerPos};



    public String cheapAptStashTitle = "Cheap Apartment Stash";
    public String USBankOfficeStashTitle = "US Bank Office Stash";
    public String docksOfficeStash1Title = "Docks Office Stash p1";
    public String docksOfficeStash2Title = "Docks Office Stash p2";
    public String docksOfficeStash3Title = "Docks Office Stash p3";
    public String farmStashTitle = "Farm Stash";

    public Component propAbilUsageError = Component.text("Invalid usage. Try using /pa to see available commands.", errorRed);

    public Component docksOfficeAbilOwnershipError = Component.text("You need to own 'Docks Office' to use this ability.", errorRed);
    public Component docksOfficeAbilDistanceError = Component.text("Go to the smooth stone at the back of the Docks Office to do this .", errorRed);

    public String USBankOfficePCTitle = "US Bank Office PC";
    public Component USBankOfficePCDistanceError = Component.text("Go to the smooth stone at the Computer in the US Bank Office to use this.", errorRed);
    public Component USBankOfficeAbilOwnershipError = Component.text("You need to own 'US Bank Office' to use this ability.", errorRed);

    public int bountyBase = 1000;
    public int bountyPriceFactor = 2;
    public Component bountyAppDisplayName = Component.text("Set Bounty", TextColor.color(0xFFA503));
    public Component bountyPlayerChoiceDisplayName = Component.text("Set Bounty", TextColor.color(0xFFA503));
    public Component bountyAppLore = Component.text("Sets a bounty on a specific player that will be awarded to their killer.");
    public Component bountyPlayerSkullLore1 = Component.text("Set a bounty on ");
    public String bountyChooseAmtWindow = "Choose Bounty Amount";
    public Component bountyChooseAmtLoreNotEnough = Component.text("Not enough $$$!");
    public Component bountyChooseAmtLore = Component.text("Click to set bounty.");
    public Component alreadyBoundError(String pName) {
        return Component.text("Player " + pName + " already has a bounty. Do /list to see player bounties.", errorRed);
    }
    public Component bountySetAlert(int size) {
        return Component.text("A bounty of $" + size + " has been set on you!", TextColor.color(0xFFA503));
    }

    public Component youAreNotInParty = Component.text("You are not in a party.", errorRed);



}
