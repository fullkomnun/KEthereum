@file:Suppress("UnstableApiUsage")

dependencyResolutionManagement {
    repositories {
        maven {
            name = "fullkomnun/KHex GitHub Packages"
            url = uri("https://maven.pkg.github.com/fullkomnun/KHex")
            credentials {
                username = "token"
                // see: https://github.community/t/download-from-github-package-registry-without-authentication/14407/44
                password = "\u0035\u0035\u0039\u0032\u0061\u0030\u0061\u0038\u0033\u0065\u0032\u0030\u0033\u0035\u0038\u0061\u0034\u0066\u0031\u0032\u0063\u0039\u0031\u0061\u0033\u0065\u0030\u0030\u0066\u0038\u0030\u0031\u0039\u0064\u0035\u0036\u0039\u0032\u0037\u0066"
            }
        }
        maven {
            name = "fullkomnun/KHash GitHub Packages"
            url = uri("https://maven.pkg.github.com/fullkomnun/KHash")
            credentials {
                username = "token"
                // see: https://github.community/t/download-from-github-package-registry-without-authentication/14407/44
                password = "\u0035\u0035\u0039\u0032\u0061\u0030\u0061\u0038\u0033\u0065\u0032\u0030\u0033\u0035\u0038\u0061\u0034\u0066\u0031\u0032\u0063\u0039\u0031\u0061\u0033\u0065\u0030\u0030\u0066\u0038\u0030\u0031\u0039\u0064\u0035\u0036\u0039\u0032\u0037\u0066"
            }
        }
        jcenter()
        maven("https://jitpack.io")
        maven("https://kotlin.bintray.com/kotlinx")
    }
}

include(":abi")
include(":abi_filter")
include(":abi_codegen")
include(":bip32")
include(":bip39")
include(":bip39_wordlist_en")
include(":bip39_wordlist_es")
include(":bip39_wordlist_fr")
include(":bip39_wordlist_it")
include(":bip39_wordlist_ja")
include(":bip39_wordlist_ko")
include(":bip39_wordlist_zh-Hans")
include(":bip39_wordlist_zh-Hant")
include(":blockscout")
include(":bloomfilter")
include(":crypto")
include(":crypto_api")
include(":crypto_impl_java_provider")
include(":crypto_impl_bouncycastle")
include(":crypto_impl_spongycastle")
include(":ens")
include(":extensions_kotlin")
include(":extensions_transactions")
include(":flows")
include(":erc20")
include(":erc55")
include(":erc67")
include(":erc181")
include(":eip137")
include(":eip155")
include(":eip191")
include(":erc634")
include(":erc681")
include(":erc831")
include(":erc961")
include(":erc1328")
include(":erc1450")
include(":erc1577")
include(":erc1577_resolver")
include(":etherscan")
include(":example_cli")
include(":keccak_shortcut")
include(":keystore")
include(":metadata_model")
include(":metadata_repo")
include(":metadata")
include(":method_signatures")
include(":model")
include(":rlp")
include(":rpc")
include(":rpc_min3")
include(":test_data")
include(":types")
include(":uri_common")
include(":wallet")
include(":erc1191")
