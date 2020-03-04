package org.kethereum.abi

const val SampleContractResponse = """
{"compiler":{"version":"0.5.12+commit.7709ece9"},"language":"Solidity","output":{"abi":[{"anonymous":false,"inputs":[{"indexed":true,"internalType":"address","name":"owner","type":"address"},{"indexed":true,"internalType":"address","name":"spender","type":"address"},{"indexed":false,"internalType":"uint256","name":"value","type":"uint256"}],"name":"Approval","type":"event"},{"anonymous":false,"inputs":[{"indexed":true,"internalType":"address","name":"account","type":"address"}],"name":"MinterAdded","type":"event"},{"anonymous":false,"inputs":[{"indexed":true,"internalType":"address","name":"account","type":"address"}],"name":"MinterRemoved","type":"event"},{"anonymous":false,"inputs":[{"indexed":true,"internalType":"address","name":"from","type":"address"},{"indexed":true,"internalType":"address","name":"to","type":"address"},{"indexed":false,"internalType":"uint256","name":"value","type":"uint256"}],"name":"Transfer","type":"event"},{"constant":false,"inputs":[{"internalType":"address","name":"account","type":"address"}],"name":"addMinter","outputs":[],"payable":false,"stateMutability":"nonpayable","type":"function"},{"constant":true,"inputs":[{"internalType":"address","name":"owner","type":"address"},{"internalType":"address","name":"spender","type":"address"}],"name":"allowance","outputs":[{"internalType":"uint256","name":"","type":"uint256"}],"payable":false,"stateMutability":"view","type":"function"},{"constant":false,"inputs":[{"internalType":"address","name":"spender","type":"address"},{"internalType":"uint256","name":"value","type":"uint256"}],"name":"approve","outputs":[{"internalType":"bool","name":"","type":"bool"}],"payable":false,"stateMutability":"nonpayable","type":"function"},{"constant":true,"inputs":[{"internalType":"address","name":"owner","type":"address"}],"name":"balanceOf","outputs":[{"internalType":"uint256","name":"","type":"uint256"}],"payable":false,"stateMutability":"view","type":"function"},{"constant":false,"inputs":[{"internalType":"address","name":"spender","type":"address"},{"internalType":"uint256","name":"subtractedValue","type":"uint256"}],"name":"decreaseAllowance","outputs":[{"internalType":"bool","name":"","type":"bool"}],"payable":false,"stateMutability":"nonpayable","type":"function"},{"constant":false,"inputs":[{"internalType":"address","name":"spender","type":"address"},{"internalType":"uint256","name":"addedValue","type":"uint256"}],"name":"increaseAllowance","outputs":[{"internalType":"bool","name":"","type":"bool"}],"payable":false,"stateMutability":"nonpayable","type":"function"},{"constant":true,"inputs":[{"internalType":"address","name":"account","type":"address"}],"name":"isMinter","outputs":[{"internalType":"bool","name":"","type":"bool"}],"payable":false,"stateMutability":"view","type":"function"},{"constant":false,"inputs":[{"internalType":"address","name":"to","type":"address"},{"internalType":"uint256","name":"value","type":"uint256"}],"name":"mint","outputs":[{"internalType":"bool","name":"","type":"bool"}],"payable":false,"stateMutability":"nonpayable","type":"function"},{"constant":false,"inputs":[],"name":"renounceMinter","outputs":[],"payable":false,"stateMutability":"nonpayable","type":"function"},{"constant":true,"inputs":[],"name":"totalSupply","outputs":[{"internalType":"uint256","name":"","type":"uint256"}],"payable":false,"stateMutability":"view","type":"function"},{"constant":false,"inputs":[{"internalType":"address","name":"to","type":"address"},{"internalType":"uint256","name":"value","type":"uint256"}],"name":"transfer","outputs":[{"internalType":"bool","name":"","type":"bool"}],"payable":false,"stateMutability":"nonpayable","type":"function"},{"constant":false,"inputs":[{"internalType":"address","name":"from","type":"address"},{"internalType":"address","name":"to","type":"address"},{"internalType":"uint256","name":"value","type":"uint256"}],"name":"transferFrom","outputs":[{"internalType":"bool","name":"","type":"bool"}],"payable":false,"stateMutability":"nonpayable","type":"function"}],"devdoc":{"details":"ERC20 minting logic","methods":{"allowance(address,address)":{"details":"Function to check the amount of tokens that an owner allowed to a spender.","params":{"owner":"address The address which owns the funds.","spender":"address The address which will spend the funds."},"return":"A uint256 specifying the amount of tokens still available for the spender."},"approve(address,uint256)":{"details":"Approve the passed address to spend the specified amount of tokens on behalf of msg.sender. Beware that changing an allowance with this method brings the risk that someone may use both the old and the new allowance by unfortunate transaction ordering. One possible solution to mitigate this race condition is to first reduce the spender's allowance to 0 and set the desired value afterwards: https://github.com/ethereum/EIPs/issues/20#issuecomment-263524729","params":{"spender":"The address which will spend the funds.","value":"The amount of tokens to be spent."}},"balanceOf(address)":{"details":"Gets the balance of the specified address.","params":{"owner":"The address to query the balance of."},"return":"An uint256 representing the amount owned by the passed address."},"decreaseAllowance(address,uint256)":{"details":"Decrease the amount of tokens that an owner allowed to a spender. approve should be called when allowed_[_spender] == 0. To decrement allowed value is better to use this function to avoid 2 calls (and wait until the first transaction is mined) From MonolithDAO Token.sol Emits an Approval event.","params":{"spender":"The address which will spend the funds.","subtractedValue":"The amount of tokens to decrease the allowance by."}},"increaseAllowance(address,uint256)":{"details":"Increase the amount of tokens that an owner allowed to a spender. approve should be called when allowed_[_spender] == 0. To increment allowed value is better to use this function to avoid 2 calls (and wait until the first transaction is mined) From MonolithDAO Token.sol Emits an Approval event.","params":{"addedValue":"The amount of tokens to increase the allowance by.","spender":"The address which will spend the funds."}},"mint(address,uint256)":{"details":"Function to mint tokens","params":{"to":"The address that will receive the minted tokens.","value":"The amount of tokens to mint."},"return":"A boolean that indicates if the operation was successful."},"totalSupply()":{"details":"Total number of tokens in existence"},"transfer(address,uint256)":{"details":"Transfer token for a specified address","params":{"to":"The address to transfer to.","value":"The amount to be transferred."}},"transferFrom(address,address,uint256)":{"details":"Transfer tokens from one address to another. Note that while this function emits an Approval event, this is not required as per the specification, and other compliant implementations may not emit the event.","params":{"from":"address The address which you want to send tokens from","to":"address The address which you want to transfer to","value":"uint256 the amount of tokens to be transferred"}}},"title":"ERC20Mintable"},"userdoc":{"methods":{"mint(address,uint256)":{"notice":"Mints `value` tokens for `to`"}}}},"settings":{"compilationTarget":{"browser/token.sol":"ERC20Mintable"},"evmVersion":"petersburg","libraries":{},"optimizer":{"enabled":false,"runs":200},"remappings":[]},"sources":{"browser/token.sol":{"keccak256":"0x6424f469b108750cde9258d4f509829967c32bfe9cfc390e46deb218e1118ae6","urls":["bzz-raw://1685afed78d6f46c37645c0c4083f93ac2120b18b928d74b17f63f88d30423ba","dweb:/ipfs/QmacMxwjUuzpo33DU4A1UJyskicz27R9PtdiPGJtvqAmMa"]}},"version":1}
        """