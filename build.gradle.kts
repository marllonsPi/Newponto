plugins {
    id("com.android.application") version "8.1.1"
    kotlin("android") version "1.5.30"
    id("com.google.gms.google-services") version "4.3.10"
}

android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "com.example.newponto"
        // Outras configurações
    }
    // Outras configurações
}

dependencies {
    implementation("com.google.firebase:firebase-database-ktx:20.0.0")
    // Outras dependências do seu aplicativo
}

// Aplicar o plugin de serviços do Google
apply(plugin = "com.google.gms.google-services")
