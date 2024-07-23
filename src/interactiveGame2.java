
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
public class interactiveGame2 {
    public static void main(String[]args) {
        Scanner a = new Scanner(System.in);
        Random q = new Random();
        System.out.println("****************************************************************************************");
        System.out.println("                                  INTERACTIVE GAME");
        System.out.println("****************************************************************************************");
        System.out.println('\n');
        System.out.println("Yolda hoşlandığın kişiyi teröristlerin rehin aldığını gördün!");
        System.out.println("A1)Kurtar");
        System.out.println("B1)Kaç");
        System.out.print("Cevap seç: ");
        String b = a.nextLine();
        if (b.equals("A1")) {
            System.out.println('\n');
            System.out.println("Başarısız oldun ve seni de rehin aldılar!");
            System.out.println("A2)Çaktırmadan polisi ara.");
            System.out.println("B2)Serbest bıraksınlar diye yalvar");
            System.out.print("Cevap seç: ");
            String c = a.nextLine();
            if (c.equals("A2")) {
                System.out.println('\n');
                System.out.println("Polisi ararken yakalandın ve seni darp ettiler.");
                int w = q.nextInt(3);
                if (w == 0) {
                    System.out.println('\n');
                    System.out.println("İç kanamadan öldün.");
                }
                if (w == 1 || w == 2) {
                    System.out.println("Bilincin kapanmıştı arada geçen olayları hatırlamıyorsun. Hastanede uyandın.");
                    System.out.println("A21)Ailenle görüşmek iste.");
                    System.out.println("B21)Hoşlandığın kişiye ne olduğunu sor");
                    System.out.print("Cevap seç: ");
                    String e = a.nextLine();
                    if (e.equals("A21")) {
                        System.out.println('\n');
                        System.out.println("Annen: Evladım sana mı kaldı elalemi kurtarmak! Bizi çok korkuttun.Ya sana bir şey olsaydı...");
                    }
                    if (e.equals("B21")) {
                        System.out.println('\n');
                        System.out.println("Polis: Durumu iyi , olay yerinden almaya sevgilisi ve ailesi geldi o da seni sordu...");
                        System.out.println("Sevgilisi mi? Bunu duyunca çok üzüldün");
                        System.out.println("B211)\"Hayatımı riske atmaya deymezmiş\" de ve hayatına devam et...");
                        System.out.println("B212)Hastaneden çıkışta onu sevgilisindenB ayırıp sen sevgili olmaya çalış (DİKKAT! Bu etik değil önerilmez)");
                        System.out.print("Cevap seç: ");
                        String m = a.nextLine();
                        if(m.equals("B212")){
                            System.out.println('\n');
                            System.out.println("Neden bu şıkkı seçtin seni şeytan! Her neyse onları ayırmak için bir yöntem seç:");
                            System.out.println("B2121)Büyü yap");
                            System.out.println("B2122)Sevgilisini öldür");
                            System.out.println("B2123)Sevgilisine yalancı mektuplar gönder");
                            System.out.println("B2124)Hala bundan vaz geçebilirsin");
                            System.out.print("Cevap seç: ");
                            String n = a.nextLine();
                            if(n.equals("B2121")){
                                int t =q.nextInt(3);
                                if(t==0||t==1){
                                    System.out.println("Başarısız oldun, büyü ile onları ayırmaya çalıştığını öğrendi onlar da sana kurbağa olma büyüsü yaptı. Hayatına bir Kurba olarak devam ediceksin.");
                                    System.out.println("Bu büyüyü bir prensesin seni öpmesi ancak bozabilir...");
                                }
                                if(t==2){System.out.println("Maalesef başardın. Ayrıldılar. Şimdi ona çıkma teklifi et.");
                                    System.out.println("Sen:Benimle çıkar mısın?");
                                    int y =q.nextInt();
                                    if(y<=0){ System.out.println("O: Tabiki! Benim için hayatını riske attın. Eski sevgilim bunu asla yapmazdı");
                                    }
                                    if(y>=1){ System.out.println("O: Maalesef olmaz.");
                                    }
                                }
                            }
                            if (n.equals("B2122")){
                                System.out.println("Sen onu bıçaklamaya çalışırken o elinden bıçağı alarak seni öldürdü. Hayat... ");
                                System.out.println(" ");
                                System.out.println(" B1" +
                                        "");
                                System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
                                System.out.println("░░░░░░░░░░░░░░░░░░░░░▓████████████████████████▒░░░░░░░░░░░░░░░░░░░░");
                                System.out.println("░░░░░░░░░░░░░░░░░░▓█████▓▒░░░░░░░░░░░░░░░▒██████▒░░░░░░░░░░░░░░░░░░");
                                System.out.println("░░░░░░░░░░░░░░░░████▒░░░░░░░░░░░░░░░░░░░░░░░░░▓███▒░░░░░░░░░░░░░░░░");
                                System.out.println("░░░░░░░░░░░░░░░███░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░███░░░░░░░░░░░░░░░");
                                System.out.println("░░░░░░░░░░░░░▒██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒██░░░░░░░░░░░░░░");
                                System.out.println("░░░░░░░░░░░░▒██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░░░░░░░░░░░░");
                                System.out.println("░░░░░░░░░░░░██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░░░░░░░░░░░");
                                System.out.println("░░░░░░░░░░░██▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒░░██░░░░░░░░░░░░");
                                System.out.println("░░░░░░░░░░░██░░██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░██░░░░░░░░░░░");
                                System.out.println("░░░░░░░░░░░██░░██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░██░░░░░░░░░░░");
                                System.out.println("░░░░░░░░░░░██░░██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░██░░░░░░░░░░░");
                                System.out.println("░░░░░░░░░░░██▒░██▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██▓░▒██░░░░░░░░░░░");
                                System.out.println("░░░░░░░░░░░░██░░██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░██░░░░░░░░░░░░");
                                System.out.println("░░░░░░░░░░░░██▒░██░░░░░▒▒▓███▒░░░░░░░▒███▓▒▒░░░░░██░▓██░░░░░░░░░░░░");
                                System.out.println("░░░░░░░░░░░░░██░██░░██████████▒░░░░░▓██████████░░██▒██░░░░░░░░░░░░░");
                                System.out.println("░░░░░░░░░░░░░░████░████████████░░░░░████████████░████░░░░░░░░░░░░░░");
                                System.out.println("░░░░░░░░░░░░░░░███░▒██████████░░░░░░░██████████▒░██▒░░░░░░░░░▒░░░░░");
                                System.out.println("░░░▒████░░░░░░░▓█▒░░█████████░░░░░░░░░█████████░░▒█▓░░░░░░▓████░░░░");
                                System.out.println("░░░██░▒██▒░░░░░██░░░░██████▓░░░░█░█░░░░███████░░░░██░░░░░███░░██░░░");
                                System.out.println("░░░██░░░██▓░░░░██░░░░░░▒▓▓░░░░▒██░██░░░░░▓▓▒░░░░░▒██░░░░███░░░██░░░");
                                System.out.println("░▓██▒░░░░████▓░░██░░░░░░░░░░░░███░███░░░░░░░░░░░░██░░█████░░░░▓██▒░");
                                System.out.println("██▓░░░░░░░░▒████████▓░░░░░░░░████░███▓░░░░░░░▒▓████████░░░░░░░░░███");
                                System.out.println("██▓▒▓███▓░░░░░░▓████████▓░░░░████░███▓░░░░▓████████▓░░░░░░████▓▓███");
                                System.out.println("░███████████▒░░░░░░███████░░░░██░░░██░░░░██████▓░░░░░░▓███████████░");
                                System.out.println("░░░░░░░░░░▓█████░░░░██▓▓░██░░░░░░░░░░░░░██░█▒██░░░▒█████▓░░░░░░░░░░");
                                System.out.println("░░░░░░░░░░░░░▒█████▒▒█▓█░███▓▓▒▒▒▓▒▒▓▓▓███▒███░▓█████░░░░░░░░░░░░░░");
                                System.out.println("░░░░░░░░░░░░░░░░░▒████▒▓█▒▒█░█▒█░█░█▓█▒█▓░█░█████▒░░░░░░░░░░░░░░░░░");
                                System.out.println("░░░░░░░░░░░░░░░░░░░░██░░██▓█▓█▓█▒█▒█▓█▓████░▓█▓░░░░░░░░░░░░░░░░░░░░");
                                System.out.println("░░░░░░░░░░░░░░░░░▓████▓░▓█▓█░█▒█░█░█▒█▒███▒░██████░░░░░░░░░░░░░░░░░");
                                System.out.println("░░░░░░░░░░░░░▓█████░░██░░░▒█████▓█▓█████▒░░░██░▒█████▓░░░░░░░░░░░░░");
                                System.out.println("░░░░▒██████████▓░░░░░███░░░░░░░░░░░░░░░░░░░██▒░░░░░▓██████████▒░░░░");
                                System.out.println("░░░░██░░░▓▓▓░░░░░░▒██████▓░░░░░░░░░░░░░░░███████▒░░░░░░▓▓▒░░▒██░░░░");
                                System.out.println("░░░░▓██░░░░░░░░▓████▓░░░█████▒░░░░░░▒▓█████░░░▓████▓░░░░░░░▒██▓░░░░");
                                System.out.println("░░░░░░███░░░░████▒░░░░░░░░▓█████████████▒░░░░░░░░▒████░░░░███░░░░░░");
                                System.out.println("░░░░░░░██░░░██▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓██░░░██░░░░░░░");
                                System.out.println("░░░░░░░██▒▓██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒██▒▓██░░░░░░░");
                                System.out.println("░░░░░░░░████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░████░░░░░░░░");
                                System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
                            }
                            if (n.equals("B2123")){
                                System.out.println("Seni şeytan! Bunu maalesef başardın! Ayrıldılar. Ona çıkma teklif et.");
                                System.out.println(" ");
                                System.out.println("********************");
                                System.out.println("Sen:Benimle çıkar mısın?");
                                int y =q.nextInt(2);
                                if(y==0){ System.out.println("O: Tabiki! Benim için hayatını riske attın. Eski sevgilim bunu asla yapmazdı");
                                }
                                if(y==1){ System.out.println("O: Maalesef olmaz.");
                                }
                                System.out.println("********************");
                            }

                        }

                    }
                }
            }
            if (c.equals("B2")) {
                    System.out.println('\n');
                    int p = q.nextInt();
                    if (p >= 1) {
                        System.out.println("Yalvarmanı umursamadılar sen de yalvarmaktan vazgeçtin");
                        System.out.println(" ");
                        System.out.println("Ellerinden kurtulman lazım!");
                        System.out.println("B221)Onlara biat et");
                        System.out.println("Tek seçeneğin var ");
                        System.out.print("Cevap seç: ");
                        String h = a.nextLine();
                        System.out.println(" ");
                        System.out.println("Polisler halkın ihbarı üzeine sonunda geldiler. Polisler teröristlere teslim olun çağrısı yapıyor... ");
                        System.out.println("Teröristler köşeye sıkıştı, çatışmaya girdi!");
                        System.out.println(" ");
                        if(h.equals("B221")){
                            System.out.println("Teröristler, çatışma devam ederse rehineleri teker teker öldüreceklerini söylediler");
                            System.out.println("Polis, çatışmamaya karar verdi, rehineleri serbest bırakmaları karşılığında gitmelerine engel olmayacaklarını söyledi");
                            System.out.println("Teröristler bunu kabul etmedi, rehinelerin de onlarla geliceğini ve birlikte gidiceklerini söyledi");
                            System.out.println("Polis çaresizce kabul etti.");
                            System.out.println("Onlarla gidiyorsununuz!");
                            System.out.println("Sizi ıssız bir depoya götürdüler");
                            System.out.println("Polislere canlı yayın açtılar ve 3 milyon dolar vermezlerse rehineleri katledeceklerini söylediler");
                            System.out.println("Polis pazarlığa başladı 250 bin dolara anlaşalım dedi");
                            System.out.println("Terristler fiyata sinirlendi ve rehinelerin birini darp edip göz dağı vermeye karar verdiler");
                            System.out.println(" ");
                            System.out.println("Kimi dövsünler(sen/o): ");
                            String t = a.nextLine();
                            if(t.equals("sen")){
                                System.out.println("Öldüresiye dövdüler neredeyse bayılıcaktın. İki dişin ve burnun kırıldı , dudağın patldı");
                                System.out.println("Teröristler 12 saat içerisinde 2,5 milyon dolar vermezlerse birini 6 saat sonra diğerini öldüreceklerini söylediler");
                                int o = q.nextInt(3);
                                if (o == 0) {
                                    System.out.println("Vermediler, teröristler seni seçti, canlı yayında seni önce dizlerinden sonra da kafandan vurmak usulüyle katlettiler. Hikayen buraya kadarmış... ");
                                    System.out.println("Hadi yine iyisin hoşlandığın kişiyi ktledecekleri esnada polis baskın yaptı ve onu kurtardı.");
                                }
                                if (o == 1) {
                                    System.out.println("Vermediler,  teröristler onu seçti, canlı yayında onu iki hareket eden aracın arkasına bağladılar ve sonra arabaları zıt yönde hareket ettirdiler.");
                                    System.out.println("Artık sevdiğin iki kişi var ");
                                    System.out.println("Polisler bu vahşete seni de kurban vermek istemediler ve seni kurtarmaya karar verdiler ");
                                    System.out.println("Teröristlere ödemeyi bitcin cinsinden ödediler, teröristler seni ellerin ve gözlerin bağlı şekilde bir konuma");
                                    System.out.println("bıraktılar, polislere bıraktıkları konumu söylediler polisler kısa sürede seni bırakılan konumdan aldılar.");


                                }
                                if (o == 2) {
                                    System.out.println("Verdiler, hadi yine iyisiniz.");
                                    System.out.println("Teröristlere ödemeyi bitcin cinsinden ödediler, teröristler sizi ellerin ve gözlerin bağlı şekilde bir konuma");
                                    System.out.println("bıraktılar, polislere bıraktıkları konumu söylediler polisler kısa sürede sizi bırakılan konumdan aldılar.");
                                }
                            }
                            if(t.equals("o")){
                                System.out.println("Öldüresiye dövdüler kolu kırıldı, bir gözü kör oldu");
                                System.out.println("Teröristler 12 saat içerisinde 2,5 milyon dolar vermezlerse birini 6 saat sonra diğerini öldüreceklerini söylediler");
                                int o = q.nextInt(3);
                                if (o == 0) {
                                    System.out.println("Vermediler, teröristler seni seçti, cellat kılıcı ile başını vücudundan ayırdılar. ");
                                    System.out.println("Ödeme gelmedi ve 6 saat sonra hoşlandığın kişiyi köpeklere parçalatarak katlettiler");
                                    System.out.println("                  ______");
                                    System.out.println("               .-\"      \"-.");
                                    System.out.println("              /            \\");
                                    System.out.println("             |              |");
                                    System.out.println("             |,  .-.  .-.  ,|");
                                    System.out.println("        /\\   | )(__/  \\__)( |");
                                    System.out.println("     __ \\/   |/     /\\     \\|");
                                    System.out.println("     \\_\\/    (_     ^^     _)   .-==/~\\");
                                    System.out.println("    ___/_,__,_\\__|IIIIII|__/__)/   /{~}}");
                                    System.out.println("    ---,---,---|-\\IIIIII/-|---,\\'-' {{~}");
                                    System.out.println("               \\          /     '-==\\}/");
                                    System.out.println("                `--------`");

                                }
                                if (o == 1) {
                                    System.out.println("Vermediler, teröristler onu seçti, canlı yayında onu dar ağacında sallandırarak katlettiler.");
                                    System.out.println("Polisler bu vahşeti beklemiyordu,blöf yaptıklarını zannediyordu. teröristlere ödemeyi bitcin cinsinden ödediler, teröristler seni ellerin ve gözlerin bağlı şekilde ");
                                    System.out.println("bir konumda bıraktılar, polislere bıraktıkları konumu söylediler polisler kısa sürede seni bırakılan konumdan aldılar.  ");
                                }
                                if (o == 2) {
                                    System.out.println("Verdiler,  vahşetten kılpayı kurtuldunuz ");
                                    System.out.println("Teröristlere ödemeyi bitcoin cinsinden ödediler, teröristler seni ellerin ve gözlerin bağlı şekilde bir konuma");
                                    System.out.println("bıraktılar, polislere bıraktıkları konumu söylediler polisler kısa sürede seni bırakılan konumdan aldılar.");
                                }

                            }
                        }
                    }
                    if (p <= 0) {
                        System.out.println("Enteresan şekilde sana acıdılar ve saldılar.");
                        System.out.println("B23)Evine dön tüfeğini al gel");
                        System.out.println("B24)Kaç polisi ara polise yardım et onu kurtar");
                        System.out.print("Cevap seç: ");
                        String g = a.nextLine();
                        if (g.equals("B23")){
                            System.out.println(" ");
                            System.out.println("Sen gelene kadar onu da rehin alıp kaçmışlar. Elinden geleni yaptın");
                            System.out.println("ama şansına küs");
                            System.out.println(" ");
                            System.out.println("Bu  bir bardak soğuk su senin için");
                            System.out.println(" ");
                            System.out.println(" ");
                            System.out.println("                                    ░░░░   ░░░░░░░░░░░░░░░░░░░                                                               \n" +
                                    "                                  ░░░░░░                                                   ░░░░░░                                  \n" +
                                    "                                  ▓▓▒▒▒▒░░            ░░░░░░  ░░  ░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▓▓▓▓                                  \n" +
                                    "                                  ▒▒▒▒▒▒░░                                             ░░░░▒▒▓▓▒▒                                  \n" +
                                    "                                  ▒▒▓▓▒▒░░                                           ░░░░▒▒▒▒▓▓▒▒                                  \n" +
                                    "                                  ░░▓▓▒▒░░                                           ░░░░▒▒▓▓▓▓░░                                  \n" +
                                    "                                    ▓▓▓▓▒▒░░                                         ░░▒▒▓▓▓▓▒▒                                    \n" +
                                    "                                    ▒▒▓▓▒▒▒▒▒▒    ░░                        ░░  ░░ ▒▒▒▒▒▒▓▓▓▓░░                                    \n" +
                                    "                                       ░░▓▓▓▒▒░░░░░░▓▓▒▒░░   ░░░░       ▒▒▒░░▒▒▒▓▓▒▒▓▓▓▓▒▒░░                                      \n" +
                                    "                                       ▒▒▓▓░░▓▓▓▓░░         ░░▒▒      ▒▒▒▒░░░░░    ░░▒▒░░██░░                                      \n" +
                                    "                                         ▒▒▒▒▒▒██▒▒         ░░▒▒      ░░░░░    ░███▒▒▓▓▒▒                                        \n" +
                                    "                                         ██▒▒▓▓▓▓▒▒         ▒▒░░      ░░▒▒     ▓▓▓███▓▓░░                                        \n" +
                                    "                                         ▓▓░░▓▓██▓▓         ▒▒░░      ░░▒▒     ░░▒███▓▓░░                                          \n" +
                                    "                                         ▓▓▒▒▓▓██░░         ▒▒░░      ░░▒▒     █▒▓▓██▒▒░░                                          \n" +
                                    "                                           ▒▒▒▒██░░         ░░▒▒      ░░▒▒     ██▓▓██░░                                          \n" +
                                    "                                           ▓▓░░▒▒▓▓         ░░▒▒      ░░▒▒     ██▓▓▓▓░░                                          \n" +
                                    "                                           ▓▓░░██▓▓         ░░░░      ░░▒▒     ████▓▓▒▒                                            \n" +
                                    "                                           ▒▒░░▓▓▒▒         ▒▒░░      ░░▓▓     ██▓▓▒▒░░                                            \n" +
                                    "                                           ░░▒▒▓▓▒▒         ░░▒▒      ░░▒▒     ██▓▓░░▒▒                                            \n" +
                                    "                                              ▒▒▓▓▒▒██         ░░ ░░ ░░    ▓▓█▒▒░░▒▒                                            \n" +
                                    "                                              ▓▓▒▒▓▓███   ░░   ░░▓▓░░░   ░░▓▓█▓▓▓▓░░                                            \n" +
                                    "                                              ▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▓▓▓▓▓▒▒▒▒                                              \n" +
                                    "                                              ▓▓▓▓▓░░░░░░░▒▒▒▒░░▒▒░░░░░██▓▓▓▓▓▒▒▒▒░░                                            \n" +
                                    "                                              ▒▓▓▓▓░░ ░░             ░░   ░░▓▓▓▓▓▓▒▒                                              \n" +
                                    "                                                   ██▓█▓▓▓▓▓▓▓▓▒▒▓▓▒▒▓▓▓▒▒████▓▓                                                \n" +
                                    "                                                      ░░░░▒▒░░░░░░▒░░░▒▒░░▒░░                                                        \n" +
                                    "                                                                                                                                                      \n" +
                                    "                                                                                                                                                      \n" +
                                    "                                                                                                                                                      \n" +
                                    "                                                                                                                    ");


                        }
                        if (g.equals("B24")){
                            System.out.println("Polisi aradın, konum söyledin Çevik Kuvvet ile geldiler");
                            System.out.println("Polis teslim olun dedi olmadılar çatışma çıktı keskin nişancılar hepsini öldürdü ve sevdiceğini kurtardılar");
                            System.out.println("Hadi yine iyisin");
                        }

                    }
                }

        }
                if (b.equals("B1")) {
                    System.out.println('\n');
                    System.out.println("Kaçtın! Haberlerde teröristlerin onu öldürdüklerini izledin.");
                    System.out.println("A11)Seni de öldürmedikleri için mutlu oldun");
                    System.out.println("B11)Depresyona girdin.");
                    System.out.print("Birini seç(A11/B11): ");
                    String d = a.nextLine();
                    if (d.equals("A11")) {
                        System.out.println('\n');
                        System.out.println("Hayat devam ediyor... Bu olay kötü bir anı olarak kaldı, psikolojin bozuldu ve bir daha kimseden hoşlanamayacaksın.");
                        System.out.println("Psikolojik tedaviler aldın,unutmaya çalıştın ama olmuyor... Unutamıyorsun. Kabul etsen de etmesen de bu acı ile yaşıyacaksın.");
                        System.out.println("Her zaman acaba kurtarmayı mı deneseydim diye düşüneceksin. Üzgünüm bu seçenek seni bu sonuca getirdi... ");

                    }
                    if (d.equals("B11")) {
                        System.out.println('\n');
                        System.out.println("Depresyona girdin ve psikolojin bozuldu artık hayattan zevk alamıyorsun. ");
                        System.out.println("A22)Psikolojik destek al");
                        System.out.println("B22)İntahar et");
                        System.out.println("C22)İntahar et");
                        System.out.print("Birini seç(A22/B22/C22): ");
                        String e = a.nextLine();
                        if (e.equals("A22")) {
                            System.out.println('\n');
                            System.out.println("Kimden psikolojik destek almak istersin?");
                            System.out.println("A12)Ailenden");
                            System.out.println("B12)Dostlarından");
                            System.out.println("C12)Psikologdan");
                            System.out.println("D12)Berberinden");
                            System.out.print("Birini seç(A12/B12/C12/D12): ");
                            String f = a.nextLine();
                            if (f.equals("A12")) {
                                System.out.println('\n');
                                int o = q.nextInt(3);
                                if (o == 0) {
                                    System.out.println("Annen: Evladım üzme kendini, her işte bir hayır vardır... ");
                                }
                                if (o == 1) {
                                    System.out.println("Baban: Ah be evladım, olmuş olan sen hayatına bak. Hayat devam ediyor. Sen kendini üzdükçe biz de üzülüyoruz... ");
                                }
                                if (o == 2) {
                                    System.out.println("Deden: Sana bizim köyden bir eş buluruz takma kafana. ");
                                }
                            }
                            if (f.equals("B12")) {
                                System.out.println('\n');
                                System.out.println("Arkadaşlar: Sen kendini üzdükçe biz de üzülüyoruz. Yapma böyle... Hem o sana bakmazdı");
                                System.out.println("Bu laf üzerine tartışma çıkar sinir krizi geçirirsin ve moral sohbeti karakolda biter...");
                            }
                            if (f.equals("C12")) {
                                System.out.println('\n');
                                System.out.println("Psikolog: Sizin bu durumda kendinizi yıpratmamak için yapmanız gereken hayatı olağan akışına bırakıp hayatı olduğu gibi kabul etmektir...");
                            }
                            if (f.equals("D12")) {
                                System.out.println('\n');
                                System.out.println("Berberim: Hayrola ne oldu mutsuz gözüküyorsun?");
                                System.out.println("Hiç sorma böyle böyle...");
                                System.out.println("Tabiki kolay bir durum değil, bu traş benden olsun...");
                            }
                        }
                        if (e.equals("B22")) {
                            System.out.println('\n');
                            System.out.println("Kendini astığın halat bağlandığı yerden çözüldü yere düştün,");
                            System.out.println("bunu bir işaret olarak algıladın ve hayata hiç olmadığı kadar tutundun.");
                            System.out.println("Artık kendin ile barışıksın. Hayata silbaştan tekrardan başladın...");
                        }
                        if (e.equals("C22")) {
                            System.out.println('\n');
                            System.out.println("Öldün ve cehenneme gittin... Keşke bu şıkkı seçmeseydin...");

                        }
                    }}
                    System.out.println('\n');
                    System.out.println("****************************************************************************************");
                    System.out.println("                                         SON");
                    System.out.println("****************************************************************************************");

            }
        }